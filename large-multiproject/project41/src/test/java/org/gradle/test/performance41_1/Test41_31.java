package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_31 {
    private final Production41_31 production = new Production41_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}