package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_340 {
    private final Production88_340 production = new Production88_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}