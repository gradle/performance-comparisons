package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_410 {
    private final Production63_410 production = new Production63_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}