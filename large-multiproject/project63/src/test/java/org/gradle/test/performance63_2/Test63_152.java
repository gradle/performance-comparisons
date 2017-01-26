package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_152 {
    private final Production63_152 production = new Production63_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}