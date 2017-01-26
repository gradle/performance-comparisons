package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_455 {
    private final Production41_455 production = new Production41_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}