package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_104 {
    private final Production41_104 production = new Production41_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}