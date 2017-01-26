package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_324 {
    private final Production41_324 production = new Production41_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}