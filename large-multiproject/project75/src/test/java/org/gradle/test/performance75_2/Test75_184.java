package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_184 {
    private final Production75_184 production = new Production75_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}