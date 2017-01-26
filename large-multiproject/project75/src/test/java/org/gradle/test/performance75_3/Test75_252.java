package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_252 {
    private final Production75_252 production = new Production75_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}