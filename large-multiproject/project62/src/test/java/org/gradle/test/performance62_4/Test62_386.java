package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_386 {
    private final Production62_386 production = new Production62_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}