package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_124 {
    private final Production63_124 production = new Production63_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}