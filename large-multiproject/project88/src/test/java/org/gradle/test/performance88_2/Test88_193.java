package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_193 {
    private final Production88_193 production = new Production88_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}