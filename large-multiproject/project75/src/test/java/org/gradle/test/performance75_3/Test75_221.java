package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_221 {
    private final Production75_221 production = new Production75_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}