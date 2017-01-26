package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_499 {
    private final Production63_499 production = new Production63_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}