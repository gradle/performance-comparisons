package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_243 {
    private final Production41_243 production = new Production41_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}