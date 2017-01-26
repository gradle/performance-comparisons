package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_302 {
    private final Production41_302 production = new Production41_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}