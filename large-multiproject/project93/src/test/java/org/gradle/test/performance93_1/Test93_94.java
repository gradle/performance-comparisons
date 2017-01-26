package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_94 {
    private final Production93_94 production = new Production93_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}