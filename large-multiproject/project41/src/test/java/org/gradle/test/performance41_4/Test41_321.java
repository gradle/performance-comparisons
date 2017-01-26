package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_321 {
    private final Production41_321 production = new Production41_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}