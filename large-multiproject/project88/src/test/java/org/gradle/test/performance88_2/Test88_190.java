package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_190 {
    private final Production88_190 production = new Production88_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}