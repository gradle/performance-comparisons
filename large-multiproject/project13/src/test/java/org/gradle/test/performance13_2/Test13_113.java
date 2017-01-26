package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_113 {
    private final Production13_113 production = new Production13_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}