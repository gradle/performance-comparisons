package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_333 {
    private final Production13_333 production = new Production13_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}