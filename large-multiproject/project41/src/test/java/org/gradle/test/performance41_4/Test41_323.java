package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_323 {
    private final Production41_323 production = new Production41_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}