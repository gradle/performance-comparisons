package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_273 {
    private final Production63_273 production = new Production63_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}