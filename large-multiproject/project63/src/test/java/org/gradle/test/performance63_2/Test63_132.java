package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_132 {
    private final Production63_132 production = new Production63_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}