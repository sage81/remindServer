package com.yava.remind.server.repository;

import com.yava.remind.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yaroslav on 5/6/2016.
 */
public interface RemindRepository extends JpaRepository<Remind, Long> {
}
