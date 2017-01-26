package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_299 {
    private final Production63_299 production = new Production63_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}