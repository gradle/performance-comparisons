package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_447 {
    private final Production13_447 production = new Production13_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}