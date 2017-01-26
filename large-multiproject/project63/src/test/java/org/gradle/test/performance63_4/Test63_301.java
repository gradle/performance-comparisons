package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_301 {
    private final Production63_301 production = new Production63_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}