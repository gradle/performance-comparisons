package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_303 {
    private final Production41_303 production = new Production41_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}