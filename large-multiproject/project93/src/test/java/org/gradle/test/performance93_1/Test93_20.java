package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_20 {
    private final Production93_20 production = new Production93_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}