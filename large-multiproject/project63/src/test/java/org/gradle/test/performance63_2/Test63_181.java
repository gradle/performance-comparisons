package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_181 {
    private final Production63_181 production = new Production63_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}