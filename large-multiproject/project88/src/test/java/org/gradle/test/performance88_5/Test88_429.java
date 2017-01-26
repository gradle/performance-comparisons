package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_429 {
    private final Production88_429 production = new Production88_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}