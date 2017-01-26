package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_287 {
    private final Production93_287 production = new Production93_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}