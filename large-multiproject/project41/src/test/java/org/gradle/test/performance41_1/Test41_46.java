package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_46 {
    private final Production41_46 production = new Production41_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}