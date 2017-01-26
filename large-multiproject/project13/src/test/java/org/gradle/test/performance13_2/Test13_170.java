package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_170 {
    private final Production13_170 production = new Production13_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}