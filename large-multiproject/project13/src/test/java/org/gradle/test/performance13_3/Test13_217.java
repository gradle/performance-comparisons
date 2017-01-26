package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_217 {
    private final Production13_217 production = new Production13_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}