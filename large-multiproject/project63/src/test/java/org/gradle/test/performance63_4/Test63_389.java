package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_389 {
    private final Production63_389 production = new Production63_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}