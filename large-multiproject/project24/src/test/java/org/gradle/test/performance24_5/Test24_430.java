package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_430 {
    private final Production24_430 production = new Production24_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}