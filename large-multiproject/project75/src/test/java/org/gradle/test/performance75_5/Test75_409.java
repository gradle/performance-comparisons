package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_409 {
    private final Production75_409 production = new Production75_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}