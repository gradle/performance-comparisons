package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_397 {
    private final Production24_397 production = new Production24_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}