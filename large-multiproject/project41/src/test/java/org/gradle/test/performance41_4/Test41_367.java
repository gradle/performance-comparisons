package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_367 {
    private final Production41_367 production = new Production41_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}