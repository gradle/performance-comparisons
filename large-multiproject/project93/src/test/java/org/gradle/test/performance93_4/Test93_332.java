package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_332 {
    private final Production93_332 production = new Production93_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}