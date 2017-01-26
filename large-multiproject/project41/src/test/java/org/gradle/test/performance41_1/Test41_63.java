package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_63 {
    private final Production41_63 production = new Production41_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}