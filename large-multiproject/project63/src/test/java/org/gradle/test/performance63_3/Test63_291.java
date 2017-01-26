package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_291 {
    private final Production63_291 production = new Production63_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}