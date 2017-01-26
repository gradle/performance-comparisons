package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_64 {
    private final Production63_64 production = new Production63_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}