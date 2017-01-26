package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_199 {
    private final Production41_199 production = new Production41_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}