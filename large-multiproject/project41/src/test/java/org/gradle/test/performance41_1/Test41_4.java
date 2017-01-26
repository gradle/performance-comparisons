package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_4 {
    private final Production41_4 production = new Production41_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}