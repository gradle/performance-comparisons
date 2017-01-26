package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_259 {
    private final Production41_259 production = new Production41_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}