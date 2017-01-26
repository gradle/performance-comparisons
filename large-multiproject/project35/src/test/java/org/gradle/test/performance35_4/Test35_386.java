package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_386 {
    private final Production35_386 production = new Production35_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}