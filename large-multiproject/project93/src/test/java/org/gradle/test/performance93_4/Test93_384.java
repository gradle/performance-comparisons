package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_384 {
    private final Production93_384 production = new Production93_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}