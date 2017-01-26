package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_203 {
    private final Production63_203 production = new Production63_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}