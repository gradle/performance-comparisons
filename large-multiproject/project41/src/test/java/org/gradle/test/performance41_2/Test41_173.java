package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_173 {
    private final Production41_173 production = new Production41_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}