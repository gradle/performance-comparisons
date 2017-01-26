package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_321 {
    private final Production63_321 production = new Production63_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}