package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_281 {
    private final Production41_281 production = new Production41_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}