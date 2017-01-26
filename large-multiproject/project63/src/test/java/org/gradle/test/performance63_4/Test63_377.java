package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_377 {
    private final Production63_377 production = new Production63_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}