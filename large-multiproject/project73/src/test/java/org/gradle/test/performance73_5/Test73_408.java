package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_408 {
    private final Production73_408 production = new Production73_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}