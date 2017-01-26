package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_136 {
    private final Production93_136 production = new Production93_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}