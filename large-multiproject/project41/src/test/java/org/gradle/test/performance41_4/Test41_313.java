package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_313 {
    private final Production41_313 production = new Production41_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}