package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_466 {
    private final Production41_466 production = new Production41_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}