package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_463 {
    private final Production63_463 production = new Production63_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}