package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_69 {
    private final Production13_69 production = new Production13_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}