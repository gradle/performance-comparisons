package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_402 {
    private final Production73_402 production = new Production73_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}