package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_291 {
    private final Production75_291 production = new Production75_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}