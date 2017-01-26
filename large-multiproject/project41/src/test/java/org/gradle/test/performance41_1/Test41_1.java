package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_1 {
    private final Production41_1 production = new Production41_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}