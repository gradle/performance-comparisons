package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_54 {
    private final Production63_54 production = new Production63_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}