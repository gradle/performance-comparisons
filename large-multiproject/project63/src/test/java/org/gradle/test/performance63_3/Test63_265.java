package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_265 {
    private final Production63_265 production = new Production63_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}