package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_478 {
    private final Production73_478 production = new Production73_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}