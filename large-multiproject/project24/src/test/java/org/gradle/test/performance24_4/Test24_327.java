package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_327 {
    private final Production24_327 production = new Production24_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}