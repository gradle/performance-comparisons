package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_6 {
    private final Production63_6 production = new Production63_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}