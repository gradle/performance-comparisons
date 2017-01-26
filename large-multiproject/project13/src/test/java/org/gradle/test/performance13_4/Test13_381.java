package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_381 {
    private final Production13_381 production = new Production13_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}