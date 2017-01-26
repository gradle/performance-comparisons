package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_470 {
    private final Production63_470 production = new Production63_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}