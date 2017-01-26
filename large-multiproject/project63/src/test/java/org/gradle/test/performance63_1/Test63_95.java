package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_95 {
    private final Production63_95 production = new Production63_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}