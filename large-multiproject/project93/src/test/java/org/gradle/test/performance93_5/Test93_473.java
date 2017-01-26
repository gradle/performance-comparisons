package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_473 {
    private final Production93_473 production = new Production93_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}