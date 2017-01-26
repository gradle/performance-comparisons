package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_175 {
    private final Production41_175 production = new Production41_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}