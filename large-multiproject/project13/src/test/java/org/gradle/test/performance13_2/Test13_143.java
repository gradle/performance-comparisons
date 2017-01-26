package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_143 {
    private final Production13_143 production = new Production13_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}