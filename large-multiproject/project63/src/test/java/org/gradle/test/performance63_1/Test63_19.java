package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_19 {
    private final Production63_19 production = new Production63_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}