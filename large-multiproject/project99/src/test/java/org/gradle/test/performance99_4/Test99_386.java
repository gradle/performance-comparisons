package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_386 {
    private final Production99_386 production = new Production99_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}