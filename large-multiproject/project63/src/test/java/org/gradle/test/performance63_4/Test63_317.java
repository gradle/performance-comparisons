package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_317 {
    private final Production63_317 production = new Production63_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}