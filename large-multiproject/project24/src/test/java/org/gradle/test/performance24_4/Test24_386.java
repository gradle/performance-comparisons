package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_386 {
    private final Production24_386 production = new Production24_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}