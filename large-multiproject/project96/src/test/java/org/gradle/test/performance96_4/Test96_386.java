package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_386 {
    private final Production96_386 production = new Production96_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}