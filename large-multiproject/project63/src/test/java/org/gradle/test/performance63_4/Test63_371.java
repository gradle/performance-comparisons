package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_371 {
    private final Production63_371 production = new Production63_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}