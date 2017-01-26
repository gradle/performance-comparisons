package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_170 {
    private final Production75_170 production = new Production75_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}