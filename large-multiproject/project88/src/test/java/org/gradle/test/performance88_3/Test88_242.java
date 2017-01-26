package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_242 {
    private final Production88_242 production = new Production88_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}