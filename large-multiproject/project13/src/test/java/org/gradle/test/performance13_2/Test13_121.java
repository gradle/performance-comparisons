package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_121 {
    private final Production13_121 production = new Production13_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}