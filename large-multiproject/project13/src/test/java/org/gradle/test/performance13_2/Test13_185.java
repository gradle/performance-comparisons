package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_185 {
    private final Production13_185 production = new Production13_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}