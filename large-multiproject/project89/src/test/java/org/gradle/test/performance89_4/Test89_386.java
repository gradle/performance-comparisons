package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_386 {
    private final Production89_386 production = new Production89_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}