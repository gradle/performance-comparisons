package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_278 {
    private final Production63_278 production = new Production63_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}