package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_108 {
    private final Production63_108 production = new Production63_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}