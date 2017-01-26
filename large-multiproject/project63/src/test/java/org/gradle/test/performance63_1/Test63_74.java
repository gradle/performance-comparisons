package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_74 {
    private final Production63_74 production = new Production63_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}