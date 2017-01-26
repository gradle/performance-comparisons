package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_386 {
    private final Production80_386 production = new Production80_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}