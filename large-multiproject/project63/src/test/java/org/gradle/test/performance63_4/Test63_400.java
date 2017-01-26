package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_400 {
    private final Production63_400 production = new Production63_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}