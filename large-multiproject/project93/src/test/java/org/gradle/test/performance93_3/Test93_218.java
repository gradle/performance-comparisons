package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_218 {
    private final Production93_218 production = new Production93_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}