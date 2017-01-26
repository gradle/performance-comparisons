package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_231 {
    private final Production41_231 production = new Production41_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}