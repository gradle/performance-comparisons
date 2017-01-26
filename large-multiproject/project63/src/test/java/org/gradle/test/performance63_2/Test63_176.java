package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_176 {
    private final Production63_176 production = new Production63_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}