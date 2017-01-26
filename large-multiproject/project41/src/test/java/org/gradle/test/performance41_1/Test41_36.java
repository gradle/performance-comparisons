package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_36 {
    private final Production41_36 production = new Production41_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}