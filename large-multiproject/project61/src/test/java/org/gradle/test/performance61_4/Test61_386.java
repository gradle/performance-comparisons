package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_386 {
    private final Production61_386 production = new Production61_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}