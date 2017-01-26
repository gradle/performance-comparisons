package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_401 {
    private final Production63_401 production = new Production63_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}