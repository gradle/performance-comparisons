package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_345 {
    private final Production93_345 production = new Production93_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}