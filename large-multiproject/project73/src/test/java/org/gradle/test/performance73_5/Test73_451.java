package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_451 {
    private final Production73_451 production = new Production73_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}