package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_6 {
    private final Production41_6 production = new Production41_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}