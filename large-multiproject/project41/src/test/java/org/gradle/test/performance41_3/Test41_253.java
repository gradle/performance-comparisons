package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_253 {
    private final Production41_253 production = new Production41_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}