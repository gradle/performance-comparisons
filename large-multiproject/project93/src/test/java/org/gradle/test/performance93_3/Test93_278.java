package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_278 {
    private final Production93_278 production = new Production93_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}