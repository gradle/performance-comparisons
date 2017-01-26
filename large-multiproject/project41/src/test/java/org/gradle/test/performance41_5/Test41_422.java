package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_422 {
    private final Production41_422 production = new Production41_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}