package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_431 {
    private final Production93_431 production = new Production93_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}