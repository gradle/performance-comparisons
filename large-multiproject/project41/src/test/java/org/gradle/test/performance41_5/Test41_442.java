package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_442 {
    private final Production41_442 production = new Production41_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}