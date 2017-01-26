package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_220 {
    private final Production41_220 production = new Production41_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}