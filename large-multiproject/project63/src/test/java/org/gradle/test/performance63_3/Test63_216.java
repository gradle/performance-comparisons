package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_216 {
    private final Production63_216 production = new Production63_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}