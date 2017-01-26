package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_424 {
    private final Production41_424 production = new Production41_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}