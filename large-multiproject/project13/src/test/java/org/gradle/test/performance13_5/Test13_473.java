package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_473 {
    private final Production13_473 production = new Production13_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}