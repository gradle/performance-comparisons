package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_375 {
    private final Production73_375 production = new Production73_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}