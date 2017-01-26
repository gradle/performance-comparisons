package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_145 {
    private final Production41_145 production = new Production41_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}