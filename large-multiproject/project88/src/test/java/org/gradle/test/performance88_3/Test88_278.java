package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_278 {
    private final Production88_278 production = new Production88_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}