package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_403 {
    private final Production88_403 production = new Production88_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}