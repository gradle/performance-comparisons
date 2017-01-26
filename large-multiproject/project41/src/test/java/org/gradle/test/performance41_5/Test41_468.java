package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_468 {
    private final Production41_468 production = new Production41_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}