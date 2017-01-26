package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_87 {
    private final Production41_87 production = new Production41_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}