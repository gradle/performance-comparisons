package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_50 {
    private final Production24_50 production = new Production24_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}