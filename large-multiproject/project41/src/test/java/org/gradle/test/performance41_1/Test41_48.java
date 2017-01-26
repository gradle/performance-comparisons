package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_48 {
    private final Production41_48 production = new Production41_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}