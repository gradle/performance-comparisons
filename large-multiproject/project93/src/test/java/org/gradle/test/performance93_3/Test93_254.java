package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_254 {
    private final Production93_254 production = new Production93_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}