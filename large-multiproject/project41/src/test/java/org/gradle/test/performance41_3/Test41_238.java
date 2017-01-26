package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_238 {
    private final Production41_238 production = new Production41_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}