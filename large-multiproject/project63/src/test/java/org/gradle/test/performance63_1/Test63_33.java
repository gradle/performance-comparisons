package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_33 {
    private final Production63_33 production = new Production63_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}