package com.aldoj.uichats_api.data.messages;

import java.sql.Date;
import java.util.UUID;

import com.aldoj.uichats_api.data.chat_room.ChatRoom;
import com.aldoj.uichats_api.data.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "messages")
@Entity
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String content;

    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private ChatRoom chat;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
