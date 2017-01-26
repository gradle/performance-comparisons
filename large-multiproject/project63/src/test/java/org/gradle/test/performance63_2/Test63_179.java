package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_179 {
    private final Production63_179 production = new Production63_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}