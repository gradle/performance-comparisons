package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_140 {
    private final Production88_140 production = new Production88_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}