package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_262 {
    private final Production73_262 production = new Production73_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}