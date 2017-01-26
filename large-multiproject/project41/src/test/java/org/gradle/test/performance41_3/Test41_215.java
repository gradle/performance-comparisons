package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_215 {
    private final Production41_215 production = new Production41_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}