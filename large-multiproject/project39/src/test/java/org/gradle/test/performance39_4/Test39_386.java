package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_386 {
    private final Production39_386 production = new Production39_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}