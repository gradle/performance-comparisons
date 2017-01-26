package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_370 {
    private final Production93_370 production = new Production93_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}