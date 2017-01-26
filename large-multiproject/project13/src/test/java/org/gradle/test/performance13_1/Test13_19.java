package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_19 {
    private final Production13_19 production = new Production13_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}