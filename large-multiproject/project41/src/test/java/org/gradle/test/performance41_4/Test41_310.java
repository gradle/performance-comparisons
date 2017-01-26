package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_310 {
    private final Production41_310 production = new Production41_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}