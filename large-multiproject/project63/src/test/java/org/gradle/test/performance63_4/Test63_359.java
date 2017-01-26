package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_359 {
    private final Production63_359 production = new Production63_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}