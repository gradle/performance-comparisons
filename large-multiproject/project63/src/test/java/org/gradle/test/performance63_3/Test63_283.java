package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_283 {
    private final Production63_283 production = new Production63_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}