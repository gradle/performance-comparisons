package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_6 {
    private final Production88_6 production = new Production88_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}