package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_486 {
    private final Production63_486 production = new Production63_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}