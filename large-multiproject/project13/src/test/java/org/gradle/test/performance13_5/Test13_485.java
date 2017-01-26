package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_485 {
    private final Production13_485 production = new Production13_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}