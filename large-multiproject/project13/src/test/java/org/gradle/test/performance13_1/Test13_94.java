package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_94 {
    private final Production13_94 production = new Production13_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}