package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_110 {
    private final Production24_110 production = new Production24_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}