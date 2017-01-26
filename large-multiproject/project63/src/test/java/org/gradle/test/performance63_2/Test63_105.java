package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_105 {
    private final Production63_105 production = new Production63_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}