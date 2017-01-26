package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_121 {
    private final Production63_121 production = new Production63_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}