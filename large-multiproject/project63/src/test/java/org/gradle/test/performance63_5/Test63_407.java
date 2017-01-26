package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_407 {
    private final Production63_407 production = new Production63_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}