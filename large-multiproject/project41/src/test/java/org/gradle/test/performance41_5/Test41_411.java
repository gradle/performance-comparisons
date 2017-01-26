package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_411 {
    private final Production41_411 production = new Production41_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}