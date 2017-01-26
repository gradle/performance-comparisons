package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_370 {
    private final Production63_370 production = new Production63_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}