package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_395 {
    private final Production41_395 production = new Production41_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}