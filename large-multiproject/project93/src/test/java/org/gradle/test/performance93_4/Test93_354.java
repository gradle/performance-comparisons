package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_354 {
    private final Production93_354 production = new Production93_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}