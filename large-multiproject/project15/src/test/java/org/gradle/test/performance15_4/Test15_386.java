package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_386 {
    private final Production15_386 production = new Production15_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}