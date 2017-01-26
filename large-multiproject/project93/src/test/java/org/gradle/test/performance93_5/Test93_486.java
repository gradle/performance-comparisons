package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_486 {
    private final Production93_486 production = new Production93_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}