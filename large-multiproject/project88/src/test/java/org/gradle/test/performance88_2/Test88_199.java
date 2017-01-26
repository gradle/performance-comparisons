package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_199 {
    private final Production88_199 production = new Production88_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}