package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_12 {
    private final Production63_12 production = new Production63_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}