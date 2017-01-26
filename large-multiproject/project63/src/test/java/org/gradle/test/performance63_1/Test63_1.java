package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_1 {
    private final Production63_1 production = new Production63_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}