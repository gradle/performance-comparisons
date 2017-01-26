package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_285 {
    private final Production20_285 production = new Production20_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}