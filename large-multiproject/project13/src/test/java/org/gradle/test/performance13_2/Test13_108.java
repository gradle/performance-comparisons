package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_108 {
    private final Production13_108 production = new Production13_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}