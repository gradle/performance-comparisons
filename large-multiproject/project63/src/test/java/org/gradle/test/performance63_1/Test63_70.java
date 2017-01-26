package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_70 {
    private final Production63_70 production = new Production63_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}