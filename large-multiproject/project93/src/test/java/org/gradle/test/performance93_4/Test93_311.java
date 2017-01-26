package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_311 {
    private final Production93_311 production = new Production93_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}