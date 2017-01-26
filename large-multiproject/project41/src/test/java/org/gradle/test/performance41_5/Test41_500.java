package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_500 {
    private final Production41_500 production = new Production41_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}