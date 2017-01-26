package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_213 {
    private final Production63_213 production = new Production63_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}