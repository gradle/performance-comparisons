package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_386 {
    private final Production26_386 production = new Production26_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}