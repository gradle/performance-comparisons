package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_321 {
    private final Production13_321 production = new Production13_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}