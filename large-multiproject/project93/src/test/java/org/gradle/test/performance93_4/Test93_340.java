package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_340 {
    private final Production93_340 production = new Production93_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}