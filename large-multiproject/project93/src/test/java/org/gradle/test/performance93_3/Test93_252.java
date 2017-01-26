package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_252 {
    private final Production93_252 production = new Production93_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}