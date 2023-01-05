package com.example.board_pr.domain;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class ArticleComment {

    private BigInteger id;
    private BigInteger ArticleId;

    private String content;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime modifiedAt;

    private String modifiedBy;


}
