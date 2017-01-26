package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_483 {
    private final Production63_483 production = new Production63_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}