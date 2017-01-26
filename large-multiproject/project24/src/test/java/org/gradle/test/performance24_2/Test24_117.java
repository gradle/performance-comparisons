package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_117 {
    private final Production24_117 production = new Production24_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}