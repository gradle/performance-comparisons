package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_318 {
    private final Production63_318 production = new Production63_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}