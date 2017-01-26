package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_223 {
    private final Production93_223 production = new Production93_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}