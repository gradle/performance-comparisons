package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_94 {
    private final Production63_94 production = new Production63_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}