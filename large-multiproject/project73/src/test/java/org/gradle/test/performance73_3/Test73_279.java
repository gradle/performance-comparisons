package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_279 {
    private final Production73_279 production = new Production73_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}