package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_280 {
    private final Production63_280 production = new Production63_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}