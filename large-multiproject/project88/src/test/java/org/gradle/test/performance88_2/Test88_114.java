package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_114 {
    private final Production88_114 production = new Production88_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}