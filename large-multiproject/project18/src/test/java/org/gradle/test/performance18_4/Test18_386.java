package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_386 {
    private final Production18_386 production = new Production18_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}