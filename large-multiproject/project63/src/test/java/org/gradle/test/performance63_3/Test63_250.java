package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_250 {
    private final Production63_250 production = new Production63_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}