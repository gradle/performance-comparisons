package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_354 {
    private final Production88_354 production = new Production88_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}