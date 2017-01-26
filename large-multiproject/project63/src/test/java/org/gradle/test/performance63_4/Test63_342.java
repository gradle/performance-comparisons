package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_342 {
    private final Production63_342 production = new Production63_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}