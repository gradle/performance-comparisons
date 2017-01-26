package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_119 {
    private final Production41_119 production = new Production41_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}