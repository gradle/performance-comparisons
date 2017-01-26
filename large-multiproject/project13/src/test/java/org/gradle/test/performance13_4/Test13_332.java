package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_332 {
    private final Production13_332 production = new Production13_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}