package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_51 {
    private final Production41_51 production = new Production41_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}