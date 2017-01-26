package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_250 {
    private final Production93_250 production = new Production93_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}