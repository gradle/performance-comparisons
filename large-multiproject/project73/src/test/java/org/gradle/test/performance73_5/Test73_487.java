package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_487 {
    private final Production73_487 production = new Production73_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}