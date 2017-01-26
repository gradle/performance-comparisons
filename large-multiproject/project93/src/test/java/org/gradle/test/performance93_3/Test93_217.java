package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_217 {
    private final Production93_217 production = new Production93_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}