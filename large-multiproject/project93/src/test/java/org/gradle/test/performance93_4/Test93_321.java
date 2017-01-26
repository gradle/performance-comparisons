package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_321 {
    private final Production93_321 production = new Production93_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}