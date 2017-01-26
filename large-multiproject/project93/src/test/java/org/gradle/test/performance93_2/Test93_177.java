package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_177 {
    private final Production93_177 production = new Production93_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}