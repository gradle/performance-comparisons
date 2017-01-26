package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_497 {
    private final Production41_497 production = new Production41_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}