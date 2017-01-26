package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_79 {
    private final Production63_79 production = new Production63_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}