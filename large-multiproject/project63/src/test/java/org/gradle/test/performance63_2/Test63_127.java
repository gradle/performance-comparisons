package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_127 {
    private final Production63_127 production = new Production63_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}