package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_458 {
    private final Production41_458 production = new Production41_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}