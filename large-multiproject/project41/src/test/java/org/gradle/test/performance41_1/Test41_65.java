package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_65 {
    private final Production41_65 production = new Production41_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}