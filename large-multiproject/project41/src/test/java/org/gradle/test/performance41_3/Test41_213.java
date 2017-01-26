package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_213 {
    private final Production41_213 production = new Production41_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}