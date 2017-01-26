package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_64 {
    private final Production88_64 production = new Production88_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}