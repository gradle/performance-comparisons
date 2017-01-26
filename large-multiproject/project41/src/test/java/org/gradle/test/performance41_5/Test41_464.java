package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_464 {
    private final Production41_464 production = new Production41_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}