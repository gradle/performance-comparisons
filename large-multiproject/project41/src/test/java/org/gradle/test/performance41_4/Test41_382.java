package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_382 {
    private final Production41_382 production = new Production41_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}