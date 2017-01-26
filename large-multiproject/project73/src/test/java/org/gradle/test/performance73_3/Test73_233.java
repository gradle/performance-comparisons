package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_233 {
    private final Production73_233 production = new Production73_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}