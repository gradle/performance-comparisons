package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_56 {
    private final Production13_56 production = new Production13_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}