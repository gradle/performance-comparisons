package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_192 {
    private final Production88_192 production = new Production88_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}