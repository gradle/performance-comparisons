package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_15 {
    private final Production41_15 production = new Production41_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}