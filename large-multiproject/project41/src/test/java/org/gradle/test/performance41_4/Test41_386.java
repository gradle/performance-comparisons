package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_386 {
    private final Production41_386 production = new Production41_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}