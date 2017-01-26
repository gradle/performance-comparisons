package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_285 {
    private final Production93_285 production = new Production93_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}