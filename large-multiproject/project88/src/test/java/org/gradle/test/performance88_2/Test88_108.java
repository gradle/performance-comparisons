package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_108 {
    private final Production88_108 production = new Production88_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}