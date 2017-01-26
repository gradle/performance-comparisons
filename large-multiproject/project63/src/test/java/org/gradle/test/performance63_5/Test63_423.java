package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_423 {
    private final Production63_423 production = new Production63_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}