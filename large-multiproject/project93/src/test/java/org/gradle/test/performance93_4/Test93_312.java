package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_312 {
    private final Production93_312 production = new Production93_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}