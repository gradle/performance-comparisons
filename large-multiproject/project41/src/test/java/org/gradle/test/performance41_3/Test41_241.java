package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_241 {
    private final Production41_241 production = new Production41_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}