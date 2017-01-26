package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_7 {
    private final Production41_7 production = new Production41_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}