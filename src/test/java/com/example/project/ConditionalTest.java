package com.example.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.condition.OS.*;

public class ConditionalTest {

    @Test
    @EnabledOnOs(MAC)
    void onlyOnMacOs() {

    }

    //@TestOnMac
    void testOnMac() {

    }

    @Test
    //@EnabledOnOs({Linux, MAC})
    void onLinuxOrMac() {

    }

    @Test
    @DisabledOnOs(WINDOWS)
    void notOnWindows() {

    }
}
