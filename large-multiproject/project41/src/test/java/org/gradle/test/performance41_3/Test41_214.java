package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_214 {
    private final Production41_214 production = new Production41_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}