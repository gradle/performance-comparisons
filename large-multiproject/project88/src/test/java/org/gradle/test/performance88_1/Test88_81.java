package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_81 {
    private final Production88_81 production = new Production88_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}