package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_346 {
    private final Production20_346 production = new Production20_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}