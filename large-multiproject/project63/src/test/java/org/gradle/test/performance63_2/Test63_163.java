package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_163 {
    private final Production63_163 production = new Production63_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}