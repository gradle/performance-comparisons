package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_86 {
    private final Production75_86 production = new Production75_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}