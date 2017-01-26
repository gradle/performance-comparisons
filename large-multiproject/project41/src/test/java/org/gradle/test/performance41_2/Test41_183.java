package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_183 {
    private final Production41_183 production = new Production41_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}