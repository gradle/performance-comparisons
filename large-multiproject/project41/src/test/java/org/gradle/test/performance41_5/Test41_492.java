package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_492 {
    private final Production41_492 production = new Production41_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}