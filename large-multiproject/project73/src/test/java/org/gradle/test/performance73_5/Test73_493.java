package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_493 {
    private final Production73_493 production = new Production73_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}