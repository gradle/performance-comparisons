package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_52 {
    private final Production93_52 production = new Production93_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}