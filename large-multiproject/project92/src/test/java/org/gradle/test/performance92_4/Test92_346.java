package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_346 {
    private final Production92_346 production = new Production92_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}