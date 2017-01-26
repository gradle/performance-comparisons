package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_160 {
    private final Production63_160 production = new Production63_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}