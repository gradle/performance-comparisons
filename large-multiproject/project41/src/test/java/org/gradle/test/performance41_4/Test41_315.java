package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_315 {
    private final Production41_315 production = new Production41_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}