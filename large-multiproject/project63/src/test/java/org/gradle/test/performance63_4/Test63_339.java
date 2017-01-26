package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_339 {
    private final Production63_339 production = new Production63_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}