package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_137 {
    private final Production41_137 production = new Production41_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}