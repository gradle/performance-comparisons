package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_412 {
    private final Production93_412 production = new Production93_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}