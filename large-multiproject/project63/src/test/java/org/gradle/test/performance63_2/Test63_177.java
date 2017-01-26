package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_177 {
    private final Production63_177 production = new Production63_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}