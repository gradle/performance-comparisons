package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_337 {
    private final Production41_337 production = new Production41_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}