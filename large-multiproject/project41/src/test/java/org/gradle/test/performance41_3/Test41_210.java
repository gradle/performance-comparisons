package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_210 {
    private final Production41_210 production = new Production41_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}