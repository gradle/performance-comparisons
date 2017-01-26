package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_446 {
    private final Production41_446 production = new Production41_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}