package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_452 {
    private final Production63_452 production = new Production63_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}