package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_438 {
    private final Production63_438 production = new Production63_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}