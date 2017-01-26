package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_134 {
    private final Production41_134 production = new Production41_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}