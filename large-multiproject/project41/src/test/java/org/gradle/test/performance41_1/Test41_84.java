package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_84 {
    private final Production41_84 production = new Production41_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}