package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_386 {
    private final Production88_386 production = new Production88_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}