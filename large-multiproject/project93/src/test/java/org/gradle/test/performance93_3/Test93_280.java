package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_280 {
    private final Production93_280 production = new Production93_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}