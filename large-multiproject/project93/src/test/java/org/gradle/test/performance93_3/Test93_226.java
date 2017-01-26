package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_226 {
    private final Production93_226 production = new Production93_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}