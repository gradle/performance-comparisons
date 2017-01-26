package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_384 {
    private final Production13_384 production = new Production13_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}