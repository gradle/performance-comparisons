package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_389 {
    private final Production93_389 production = new Production93_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}