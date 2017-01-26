package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_63 {
    private final Production63_63 production = new Production63_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}