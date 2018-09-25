package com.test.conditional;

/**
 * @author Justyn
 * @date 2018/9/25 9:14
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
