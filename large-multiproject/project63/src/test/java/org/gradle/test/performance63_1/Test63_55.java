package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_55 {
    private final Production63_55 production = new Production63_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}