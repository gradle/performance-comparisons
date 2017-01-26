package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_103 {
    private final Production63_103 production = new Production63_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}