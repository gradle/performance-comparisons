package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_300 {
    private final Production41_300 production = new Production41_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}