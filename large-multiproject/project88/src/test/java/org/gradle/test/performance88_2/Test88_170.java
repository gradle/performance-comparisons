package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_170 {
    private final Production88_170 production = new Production88_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}