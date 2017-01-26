package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_291 {
    private final Production13_291 production = new Production13_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}