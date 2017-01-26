package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_12 {
    private final Production13_12 production = new Production13_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}