package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_233 {
    private final Production63_233 production = new Production63_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}