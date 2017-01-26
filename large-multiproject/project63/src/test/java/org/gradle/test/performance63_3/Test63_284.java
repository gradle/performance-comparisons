package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_284 {
    private final Production63_284 production = new Production63_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}