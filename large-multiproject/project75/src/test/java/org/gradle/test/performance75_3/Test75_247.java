package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_247 {
    private final Production75_247 production = new Production75_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}