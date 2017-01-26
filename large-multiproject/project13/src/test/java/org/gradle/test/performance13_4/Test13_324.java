package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_324 {
    private final Production13_324 production = new Production13_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}