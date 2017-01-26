package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_468 {
    private final Production13_468 production = new Production13_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}