package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_459 {
    private final Production93_459 production = new Production93_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}