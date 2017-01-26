package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_342 {
    private final Production93_342 production = new Production93_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}