package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_389 {
    private final Production73_389 production = new Production73_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}