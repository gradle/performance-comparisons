package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_368 {
    private final Production63_368 production = new Production63_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}