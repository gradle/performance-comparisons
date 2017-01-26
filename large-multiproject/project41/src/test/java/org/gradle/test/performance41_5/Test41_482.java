package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_482 {
    private final Production41_482 production = new Production41_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}