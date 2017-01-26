package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_386 {
    private final Production58_386 production = new Production58_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}