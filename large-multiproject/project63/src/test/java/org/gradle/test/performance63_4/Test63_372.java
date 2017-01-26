package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_372 {
    private final Production63_372 production = new Production63_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}