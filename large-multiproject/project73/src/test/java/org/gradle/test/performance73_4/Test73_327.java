package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_327 {
    private final Production73_327 production = new Production73_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}