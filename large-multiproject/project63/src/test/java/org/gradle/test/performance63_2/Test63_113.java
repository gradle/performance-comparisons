package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_113 {
    private final Production63_113 production = new Production63_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}