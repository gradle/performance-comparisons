package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_472 {
    private final Production93_472 production = new Production93_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}