package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_239 {
    private final Production41_239 production = new Production41_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}