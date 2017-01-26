package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_429 {
    private final Production63_429 production = new Production63_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}