package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_193 {
    private final Production63_193 production = new Production63_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}