package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_438 {
    private final Production93_438 production = new Production93_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}