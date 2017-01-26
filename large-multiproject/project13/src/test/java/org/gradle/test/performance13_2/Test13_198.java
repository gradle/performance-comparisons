package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_198 {
    private final Production13_198 production = new Production13_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}