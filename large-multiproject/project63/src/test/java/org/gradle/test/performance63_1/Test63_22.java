package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_22 {
    private final Production63_22 production = new Production63_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}