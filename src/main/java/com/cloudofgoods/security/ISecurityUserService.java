package com.cloudofgoods.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}
