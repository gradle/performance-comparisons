package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_116 {
    private final Production13_116 production = new Production13_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}