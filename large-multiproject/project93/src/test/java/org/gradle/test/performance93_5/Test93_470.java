package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_470 {
    private final Production93_470 production = new Production93_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}