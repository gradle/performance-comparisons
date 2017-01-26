package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_260 {
    private final Production41_260 production = new Production41_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}