package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_18 {
    private final Production63_18 production = new Production63_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}