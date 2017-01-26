package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_10 {
    private final Production41_10 production = new Production41_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}