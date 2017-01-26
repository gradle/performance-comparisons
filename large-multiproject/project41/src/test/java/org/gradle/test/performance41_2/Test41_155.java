package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_155 {
    private final Production41_155 production = new Production41_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}