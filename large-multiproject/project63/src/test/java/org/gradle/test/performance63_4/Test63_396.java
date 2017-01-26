package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_396 {
    private final Production63_396 production = new Production63_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}