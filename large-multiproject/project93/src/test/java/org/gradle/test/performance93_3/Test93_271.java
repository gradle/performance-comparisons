package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_271 {
    private final Production93_271 production = new Production93_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}