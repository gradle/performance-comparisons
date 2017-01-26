package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_377 {
    private final Production93_377 production = new Production93_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}