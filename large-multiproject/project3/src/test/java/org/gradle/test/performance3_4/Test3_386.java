package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_386 {
    private final Production3_386 production = new Production3_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}