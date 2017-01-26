package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_402 {
    private final Production88_402 production = new Production88_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}