package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_13 {
    private final Production93_13 production = new Production93_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}