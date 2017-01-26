package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_346 {
    private final Production24_346 production = new Production24_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}