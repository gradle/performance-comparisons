package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_198 {
    private final Production63_198 production = new Production63_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}