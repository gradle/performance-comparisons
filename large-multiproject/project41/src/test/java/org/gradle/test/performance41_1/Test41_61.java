package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_61 {
    private final Production41_61 production = new Production41_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}