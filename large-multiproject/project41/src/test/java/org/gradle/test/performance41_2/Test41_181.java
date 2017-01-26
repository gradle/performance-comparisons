package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_181 {
    private final Production41_181 production = new Production41_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}