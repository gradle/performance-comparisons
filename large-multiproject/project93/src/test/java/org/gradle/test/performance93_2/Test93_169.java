package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_169 {
    private final Production93_169 production = new Production93_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}