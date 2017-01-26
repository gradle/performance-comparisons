package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_125 {
    private final Production93_125 production = new Production93_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}