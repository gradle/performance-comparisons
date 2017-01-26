package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_298 {
    private final Production63_298 production = new Production63_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}