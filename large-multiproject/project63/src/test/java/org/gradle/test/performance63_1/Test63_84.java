package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_84 {
    private final Production63_84 production = new Production63_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}