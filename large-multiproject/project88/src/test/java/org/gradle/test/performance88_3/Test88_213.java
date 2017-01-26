package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_213 {
    private final Production88_213 production = new Production88_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}