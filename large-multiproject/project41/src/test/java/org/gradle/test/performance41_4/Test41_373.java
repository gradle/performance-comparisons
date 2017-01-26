package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_373 {
    private final Production41_373 production = new Production41_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}