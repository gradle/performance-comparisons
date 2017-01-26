package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_349 {
    private final Production63_349 production = new Production63_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}