package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_386 {
    private final Production25_386 production = new Production25_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}