package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_348 {
    private final Production75_348 production = new Production75_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}