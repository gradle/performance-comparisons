package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_455 {
    private final Production13_455 production = new Production13_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}