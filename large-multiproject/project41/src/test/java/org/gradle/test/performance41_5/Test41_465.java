package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_465 {
    private final Production41_465 production = new Production41_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}