package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_344 {
    private final Production63_344 production = new Production63_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}