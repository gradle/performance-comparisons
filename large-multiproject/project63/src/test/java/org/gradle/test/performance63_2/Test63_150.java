package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_150 {
    private final Production63_150 production = new Production63_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}