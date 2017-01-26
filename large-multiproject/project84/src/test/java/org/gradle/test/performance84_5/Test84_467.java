package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_467 {
    private final Production84_467 production = new Production84_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}