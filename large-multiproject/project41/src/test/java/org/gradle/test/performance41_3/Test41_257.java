package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_257 {
    private final Production41_257 production = new Production41_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}