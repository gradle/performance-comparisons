package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_329 {
    private final Production41_329 production = new Production41_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}