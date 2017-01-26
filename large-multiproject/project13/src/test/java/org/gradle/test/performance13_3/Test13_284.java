package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_284 {
    private final Production13_284 production = new Production13_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}