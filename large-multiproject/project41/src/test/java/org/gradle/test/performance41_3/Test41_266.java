package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_266 {
    private final Production41_266 production = new Production41_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}