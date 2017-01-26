package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_292 {
    private final Production24_292 production = new Production24_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}