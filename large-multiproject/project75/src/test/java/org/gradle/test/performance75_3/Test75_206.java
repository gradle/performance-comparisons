package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_206 {
    private final Production75_206 production = new Production75_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}