package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_158 {
    private final Production63_158 production = new Production63_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}