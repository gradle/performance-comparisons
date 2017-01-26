package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_479 {
    private final Production41_479 production = new Production41_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}