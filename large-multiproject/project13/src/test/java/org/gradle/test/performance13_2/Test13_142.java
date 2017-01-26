package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_142 {
    private final Production13_142 production = new Production13_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}