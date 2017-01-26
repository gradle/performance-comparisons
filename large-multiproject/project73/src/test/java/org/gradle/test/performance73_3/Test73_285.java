package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_285 {
    private final Production73_285 production = new Production73_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}