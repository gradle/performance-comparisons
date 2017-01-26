package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_26 {
    private final Production41_26 production = new Production41_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}