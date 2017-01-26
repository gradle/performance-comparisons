package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_70 {
    private final Production13_70 production = new Production13_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}