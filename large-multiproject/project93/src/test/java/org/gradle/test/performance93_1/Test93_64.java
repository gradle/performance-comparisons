package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_64 {
    private final Production93_64 production = new Production93_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}