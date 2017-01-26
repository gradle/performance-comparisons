package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_139 {
    private final Production41_139 production = new Production41_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}