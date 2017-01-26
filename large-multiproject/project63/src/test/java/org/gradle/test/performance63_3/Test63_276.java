package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_276 {
    private final Production63_276 production = new Production63_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}