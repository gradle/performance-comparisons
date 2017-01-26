package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_365 {
    private final Production41_365 production = new Production41_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}