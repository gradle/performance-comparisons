package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_162 {
    private final Production63_162 production = new Production63_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}