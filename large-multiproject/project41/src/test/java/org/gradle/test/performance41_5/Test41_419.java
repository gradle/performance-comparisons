package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_419 {
    private final Production41_419 production = new Production41_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}