package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_198 {
    private final Production93_198 production = new Production93_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}