package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_227 {
    private final Production41_227 production = new Production41_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}