package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_386 {
    private final Production49_386 production = new Production49_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}