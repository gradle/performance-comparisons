package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_348 {
    private final Production93_348 production = new Production93_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}