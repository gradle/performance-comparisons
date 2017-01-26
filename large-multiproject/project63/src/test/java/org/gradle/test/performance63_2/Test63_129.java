package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_129 {
    private final Production63_129 production = new Production63_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}