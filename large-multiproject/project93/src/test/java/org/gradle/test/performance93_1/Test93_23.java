package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_23 {
    private final Production93_23 production = new Production93_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}