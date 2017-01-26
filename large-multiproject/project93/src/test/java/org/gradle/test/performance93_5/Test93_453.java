package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_453 {
    private final Production93_453 production = new Production93_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}