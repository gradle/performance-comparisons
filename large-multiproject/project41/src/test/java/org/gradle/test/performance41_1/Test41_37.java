package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_37 {
    private final Production41_37 production = new Production41_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}