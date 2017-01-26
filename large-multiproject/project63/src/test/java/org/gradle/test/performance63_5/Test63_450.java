package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_450 {
    private final Production63_450 production = new Production63_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}