package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_341 {
    private final Production93_341 production = new Production93_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}