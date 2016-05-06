package com.yava.remind.server.service;

import com.yava.remind.server.entity.Remind;

import java.util.List;

/**
 * Created by Yaroslav on 5/6/2016.
 */
public interface ReminderService {

    List<Remind> getAll();
    Remind getById(long id);
    Remind save(Remind remind);
    void remove(long id);
}
