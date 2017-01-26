package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_346 {
    private final Production37_346 production = new Production37_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}