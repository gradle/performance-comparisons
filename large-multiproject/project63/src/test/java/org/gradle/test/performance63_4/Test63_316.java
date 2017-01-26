package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_316 {
    private final Production63_316 production = new Production63_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}