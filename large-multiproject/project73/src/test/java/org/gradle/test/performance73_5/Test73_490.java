package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_490 {
    private final Production73_490 production = new Production73_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}