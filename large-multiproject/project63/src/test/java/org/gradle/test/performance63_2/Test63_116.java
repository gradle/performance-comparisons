package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_116 {
    private final Production63_116 production = new Production63_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}