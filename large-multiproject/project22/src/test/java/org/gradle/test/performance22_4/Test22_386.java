package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_386 {
    private final Production22_386 production = new Production22_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}