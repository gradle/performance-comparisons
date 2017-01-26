package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_83 {
    private final Production63_83 production = new Production63_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}