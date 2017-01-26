package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_386 {
    private final Production4_386 production = new Production4_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}