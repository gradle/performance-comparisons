package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_437 {
    private final Production41_437 production = new Production41_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}