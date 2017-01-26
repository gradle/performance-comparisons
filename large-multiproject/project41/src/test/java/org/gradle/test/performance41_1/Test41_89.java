package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_89 {
    private final Production41_89 production = new Production41_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}