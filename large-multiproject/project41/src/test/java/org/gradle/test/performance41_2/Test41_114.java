package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_114 {
    private final Production41_114 production = new Production41_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}