package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_405 {
    private final Production13_405 production = new Production13_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}