package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_149 {
    private final Production63_149 production = new Production63_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}