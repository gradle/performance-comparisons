package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_385 {
    private final Production75_385 production = new Production75_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}