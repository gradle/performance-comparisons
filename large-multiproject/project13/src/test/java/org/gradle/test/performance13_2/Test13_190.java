package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_190 {
    private final Production13_190 production = new Production13_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}