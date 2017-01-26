package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_436 {
    private final Production13_436 production = new Production13_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}