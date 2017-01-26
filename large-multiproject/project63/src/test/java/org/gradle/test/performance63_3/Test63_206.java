package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_206 {
    private final Production63_206 production = new Production63_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}