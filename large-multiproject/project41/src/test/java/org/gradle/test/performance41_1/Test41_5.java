package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_5 {
    private final Production41_5 production = new Production41_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}