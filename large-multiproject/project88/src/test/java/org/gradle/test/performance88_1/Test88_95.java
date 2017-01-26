package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_95 {
    private final Production88_95 production = new Production88_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}