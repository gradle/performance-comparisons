package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_18 {
    private final Production13_18 production = new Production13_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}