package com.multicampus.biz.user;

import lombok.Data;

@Data
// 1. VO Å¬·¡½º
public class UserVO {
	private String id;
	private String password;
	private String name;
	private String role;
}
