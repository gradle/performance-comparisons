package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_284 {
    private final Production24_284 production = new Production24_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}