package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_290 {
    private final Production88_290 production = new Production88_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}