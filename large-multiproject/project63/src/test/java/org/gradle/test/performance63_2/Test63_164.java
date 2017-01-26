package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_164 {
    private final Production63_164 production = new Production63_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}