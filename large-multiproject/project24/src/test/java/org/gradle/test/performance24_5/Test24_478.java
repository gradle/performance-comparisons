package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_478 {
    private final Production24_478 production = new Production24_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}