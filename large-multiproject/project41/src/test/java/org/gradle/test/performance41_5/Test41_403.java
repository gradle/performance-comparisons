package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_403 {
    private final Production41_403 production = new Production41_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}