package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_263 {
    private final Production41_263 production = new Production41_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}