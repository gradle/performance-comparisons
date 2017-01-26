package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_471 {
    private final Production41_471 production = new Production41_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}