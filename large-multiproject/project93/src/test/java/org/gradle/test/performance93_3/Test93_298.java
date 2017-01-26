package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_298 {
    private final Production93_298 production = new Production93_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}