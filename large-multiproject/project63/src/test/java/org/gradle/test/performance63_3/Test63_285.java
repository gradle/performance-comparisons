package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_285 {
    private final Production63_285 production = new Production63_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}