package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_244 {
    private final Production63_244 production = new Production63_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}