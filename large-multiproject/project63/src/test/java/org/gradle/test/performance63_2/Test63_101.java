package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_101 {
    private final Production63_101 production = new Production63_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}