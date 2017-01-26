package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_386 {
    private final Production98_386 production = new Production98_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}