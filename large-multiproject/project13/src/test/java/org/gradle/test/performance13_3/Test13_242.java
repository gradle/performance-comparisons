package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_242 {
    private final Production13_242 production = new Production13_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}