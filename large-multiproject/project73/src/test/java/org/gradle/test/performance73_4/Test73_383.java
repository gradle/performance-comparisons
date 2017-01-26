package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_383 {
    private final Production73_383 production = new Production73_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}