package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_200 {
    private final Production41_200 production = new Production41_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}