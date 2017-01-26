package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_129 {
    private final Production93_129 production = new Production93_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}