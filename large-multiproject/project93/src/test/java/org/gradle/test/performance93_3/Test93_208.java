package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_208 {
    private final Production93_208 production = new Production93_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}