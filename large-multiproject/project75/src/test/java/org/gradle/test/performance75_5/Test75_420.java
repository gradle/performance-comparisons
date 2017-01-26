package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_420 {
    private final Production75_420 production = new Production75_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}