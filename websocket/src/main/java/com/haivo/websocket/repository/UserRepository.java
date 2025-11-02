package com.haivo.websocket.repository;

import com.haivo.websocket.user.Status;
import com.haivo.websocket.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository  extends MongoRepository<User, String> {
    List<User> findAllByStatus(Status status);
}
