package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_161 {
    private final Production41_161 production = new Production41_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}