package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_30 {
    private final Production63_30 production = new Production63_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}