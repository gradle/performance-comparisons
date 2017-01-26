package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_271 {
    private final Production63_271 production = new Production63_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}