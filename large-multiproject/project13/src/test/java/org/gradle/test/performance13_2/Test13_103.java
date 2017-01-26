package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_103 {
    private final Production13_103 production = new Production13_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}