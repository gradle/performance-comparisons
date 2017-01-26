package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_117 {
    private final Production73_117 production = new Production73_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}