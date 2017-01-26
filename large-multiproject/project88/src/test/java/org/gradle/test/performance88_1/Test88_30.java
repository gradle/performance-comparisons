package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_30 {
    private final Production88_30 production = new Production88_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}