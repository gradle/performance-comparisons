package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_472 {
    private final Production13_472 production = new Production13_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}