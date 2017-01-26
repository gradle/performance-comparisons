package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_335 {
    private final Production24_335 production = new Production24_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}