package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_59 {
    private final Production41_59 production = new Production41_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}