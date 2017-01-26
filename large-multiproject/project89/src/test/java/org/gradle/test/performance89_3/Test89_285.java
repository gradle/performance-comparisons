package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_285 {
    private final Production89_285 production = new Production89_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}