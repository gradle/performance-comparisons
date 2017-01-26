package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_345 {
    private final Production63_345 production = new Production63_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}