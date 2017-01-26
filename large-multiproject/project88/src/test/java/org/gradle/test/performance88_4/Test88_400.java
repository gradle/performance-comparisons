package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_400 {
    private final Production88_400 production = new Production88_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}