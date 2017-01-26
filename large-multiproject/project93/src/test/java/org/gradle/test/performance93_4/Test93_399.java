package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_399 {
    private final Production93_399 production = new Production93_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}