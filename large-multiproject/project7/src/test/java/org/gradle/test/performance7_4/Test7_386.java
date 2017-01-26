package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_386 {
    private final Production7_386 production = new Production7_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}