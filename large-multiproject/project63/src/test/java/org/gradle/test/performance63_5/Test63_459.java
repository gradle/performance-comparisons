package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_459 {
    private final Production63_459 production = new Production63_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}