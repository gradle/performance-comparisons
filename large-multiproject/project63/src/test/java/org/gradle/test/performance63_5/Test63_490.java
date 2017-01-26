package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_490 {
    private final Production63_490 production = new Production63_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}