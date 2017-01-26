package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_346 {
    private final Production4_346 production = new Production4_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}