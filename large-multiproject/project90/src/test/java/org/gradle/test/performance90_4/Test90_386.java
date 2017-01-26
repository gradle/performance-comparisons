package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_386 {
    private final Production90_386 production = new Production90_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}