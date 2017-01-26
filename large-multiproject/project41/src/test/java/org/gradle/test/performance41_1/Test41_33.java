package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_33 {
    private final Production41_33 production = new Production41_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}