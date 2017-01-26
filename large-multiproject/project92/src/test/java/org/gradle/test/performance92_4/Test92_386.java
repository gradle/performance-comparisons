package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_386 {
    private final Production92_386 production = new Production92_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}