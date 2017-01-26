package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_469 {
    private final Production13_469 production = new Production13_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}