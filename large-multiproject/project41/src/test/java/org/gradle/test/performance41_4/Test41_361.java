package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_361 {
    private final Production41_361 production = new Production41_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}