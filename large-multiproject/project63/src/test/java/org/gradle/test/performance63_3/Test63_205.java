package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_205 {
    private final Production63_205 production = new Production63_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}