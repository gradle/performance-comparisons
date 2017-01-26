package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_343 {
    private final Production63_343 production = new Production63_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}