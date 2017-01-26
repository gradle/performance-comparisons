package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_328 {
    private final Production73_328 production = new Production73_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}