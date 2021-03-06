package com.akifmuje.todolisttask.repositores;

import com.akifmuje.todolisttask.models.DependencyItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DependencyItemRepository extends JpaRepository<DependencyItem,Integer> {

    @Modifying
    void deleteListDependencies(@Param("list_id") int list_id);

    @Modifying
    void deleteItemDependencies(@Param("item_id") int item_id);

    @Modifying
    void deleteDependency(@Param("still_waiting_id") int still_waiting_id,@Param("tobe_completed_id") int tobe_completed_id);

    List<DependencyItem> checkDependency(@Param("still_waiting_id") int still_waiting_id, @Param("tobe_completed_id") int tobe_completed_id);

    List<DependencyItem> checkMarkCondition(@Param("still_waiting_id") int still_waiting_id);
}
