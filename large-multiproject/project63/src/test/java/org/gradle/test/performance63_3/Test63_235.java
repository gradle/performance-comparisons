package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_235 {
    private final Production63_235 production = new Production63_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}