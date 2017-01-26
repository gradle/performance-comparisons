package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_25 {
    private final Production41_25 production = new Production41_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}