package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_275 {
    private final Production63_275 production = new Production63_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}