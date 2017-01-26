package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_386 {
    private final Production27_386 production = new Production27_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}