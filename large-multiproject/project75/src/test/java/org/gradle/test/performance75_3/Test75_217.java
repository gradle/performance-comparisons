package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_217 {
    private final Production75_217 production = new Production75_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}