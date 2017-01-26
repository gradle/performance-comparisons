package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_409 {
    private final Production13_409 production = new Production13_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}