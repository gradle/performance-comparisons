package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_206 {
    private final Production93_206 production = new Production93_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}