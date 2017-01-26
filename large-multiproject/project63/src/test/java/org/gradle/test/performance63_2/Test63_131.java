package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_131 {
    private final Production63_131 production = new Production63_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}