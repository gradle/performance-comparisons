package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_81 {
    private final Production63_81 production = new Production63_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}