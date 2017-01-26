package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_451 {
    private final Production24_451 production = new Production24_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}