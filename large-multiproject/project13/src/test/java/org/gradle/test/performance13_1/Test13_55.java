package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_55 {
    private final Production13_55 production = new Production13_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}