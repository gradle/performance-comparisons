package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_192 {
    private final Production93_192 production = new Production93_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}