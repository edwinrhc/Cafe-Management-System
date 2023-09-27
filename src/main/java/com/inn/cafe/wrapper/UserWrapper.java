package com.inn.cafe.wrapper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserWrapper {

    private Integer id;
    private String name;
    private String email;
    private String contact_number;
    private String status;

    public UserWrapper(Integer id, String name, String email, String contact_number, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact_number = contact_number;
        this.status = status;
    }
}
