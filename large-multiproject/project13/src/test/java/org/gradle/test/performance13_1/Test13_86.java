package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_86 {
    private final Production13_86 production = new Production13_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}