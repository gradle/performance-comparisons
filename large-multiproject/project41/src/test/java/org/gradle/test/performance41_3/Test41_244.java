package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_244 {
    private final Production41_244 production = new Production41_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}