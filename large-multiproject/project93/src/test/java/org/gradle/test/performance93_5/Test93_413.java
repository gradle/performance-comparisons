package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_413 {
    private final Production93_413 production = new Production93_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}