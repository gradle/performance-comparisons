package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_249 {
    private final Production63_249 production = new Production63_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}