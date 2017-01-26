package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_328 {
    private final Production63_328 production = new Production63_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}