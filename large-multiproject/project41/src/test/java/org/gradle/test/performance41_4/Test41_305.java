package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_305 {
    private final Production41_305 production = new Production41_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}