package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_147 {
    private final Production41_147 production = new Production41_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}