package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_413 {
    private final Production75_413 production = new Production75_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}