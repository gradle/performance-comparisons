package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_174 {
    private final Production63_174 production = new Production63_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}