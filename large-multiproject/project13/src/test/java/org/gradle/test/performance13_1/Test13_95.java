package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_95 {
    private final Production13_95 production = new Production13_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}