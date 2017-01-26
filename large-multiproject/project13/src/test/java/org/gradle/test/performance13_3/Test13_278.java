package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_278 {
    private final Production13_278 production = new Production13_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}