package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_115 {
    private final Production93_115 production = new Production93_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}