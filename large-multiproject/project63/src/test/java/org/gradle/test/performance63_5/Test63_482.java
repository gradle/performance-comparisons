package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_482 {
    private final Production63_482 production = new Production63_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}