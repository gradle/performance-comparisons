package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_287 {
    private final Production80_287 production = new Production80_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}