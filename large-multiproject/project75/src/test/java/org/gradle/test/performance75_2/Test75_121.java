package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_121 {
    private final Production75_121 production = new Production75_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}