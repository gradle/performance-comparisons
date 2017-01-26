package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_240 {
    private final Production63_240 production = new Production63_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}