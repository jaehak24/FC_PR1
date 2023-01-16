package com.example.fc_project_pr1.domain;


import lombok.Getter;
import lombok.ToString;

import javax.persistence.Table;

@Getter
@ToString //쉽게 출력이 가능하게끔
@Table()
public class Articles {
    private Long id;

}
