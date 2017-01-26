package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_252 {
    private final Production13_252 production = new Production13_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}