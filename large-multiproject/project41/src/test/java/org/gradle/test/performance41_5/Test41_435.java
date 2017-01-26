package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_435 {
    private final Production41_435 production = new Production41_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}