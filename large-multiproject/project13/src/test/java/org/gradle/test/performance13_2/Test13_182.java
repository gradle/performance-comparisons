package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_182 {
    private final Production13_182 production = new Production13_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}