package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_345 {
    private final Production13_345 production = new Production13_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}