package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_240 {
    private final Production24_240 production = new Production24_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}