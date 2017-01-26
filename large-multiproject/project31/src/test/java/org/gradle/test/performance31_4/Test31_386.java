package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_386 {
    private final Production31_386 production = new Production31_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}