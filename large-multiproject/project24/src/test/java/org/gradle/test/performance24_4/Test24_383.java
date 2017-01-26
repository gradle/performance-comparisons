package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_383 {
    private final Production24_383 production = new Production24_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}