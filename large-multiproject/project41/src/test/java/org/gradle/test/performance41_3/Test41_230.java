package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_230 {
    private final Production41_230 production = new Production41_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}