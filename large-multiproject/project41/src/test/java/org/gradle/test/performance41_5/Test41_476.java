package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_476 {
    private final Production41_476 production = new Production41_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}