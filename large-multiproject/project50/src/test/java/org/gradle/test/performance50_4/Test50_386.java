package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_386 {
    private final Production50_386 production = new Production50_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}