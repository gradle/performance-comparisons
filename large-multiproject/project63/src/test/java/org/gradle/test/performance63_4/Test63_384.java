package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_384 {
    private final Production63_384 production = new Production63_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}