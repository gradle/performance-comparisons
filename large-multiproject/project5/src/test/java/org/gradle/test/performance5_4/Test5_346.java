package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_346 {
    private final Production5_346 production = new Production5_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}