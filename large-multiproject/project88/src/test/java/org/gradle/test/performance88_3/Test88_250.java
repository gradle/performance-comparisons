package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_250 {
    private final Production88_250 production = new Production88_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}