package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_386 {
    private final Production8_386 production = new Production8_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}