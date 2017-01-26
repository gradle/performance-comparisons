package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_201 {
    private final Production63_201 production = new Production63_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}