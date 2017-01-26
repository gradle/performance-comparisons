package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_90 {
    private final Production41_90 production = new Production41_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}