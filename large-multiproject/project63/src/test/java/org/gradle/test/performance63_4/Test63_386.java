package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_386 {
    private final Production63_386 production = new Production63_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}