package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_260 {
    private final Production63_260 production = new Production63_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}