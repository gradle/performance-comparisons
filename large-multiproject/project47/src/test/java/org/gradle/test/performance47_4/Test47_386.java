package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_386 {
    private final Production47_386 production = new Production47_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}