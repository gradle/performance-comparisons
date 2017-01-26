package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_180 {
    private final Production13_180 production = new Production13_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}