package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_308 {
    private final Production75_308 production = new Production75_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}