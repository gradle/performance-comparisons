package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_146 {
    private final Production41_146 production = new Production41_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}