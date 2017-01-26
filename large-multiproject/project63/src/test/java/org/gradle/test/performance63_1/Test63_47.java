package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_47 {
    private final Production63_47 production = new Production63_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}