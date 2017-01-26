package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_359 {
    private final Production93_359 production = new Production93_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}