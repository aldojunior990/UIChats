package com.aldoj.uichats_api.data.registrations;

import com.aldoj.uichats_api.data.chat_room.ChatRoom;
import com.aldoj.uichats_api.data.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "registration")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Registrations {

    @EmbeddedId
    private RegistrationID id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(nullable = false, name = "user_id")
    private User user;


    @ManyToOne
    @MapsId("chatId")
    @JoinColumn(nullable = false, name = "chat_id")
    private ChatRoom chatRoom;

}
