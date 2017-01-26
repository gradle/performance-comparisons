package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_140 {
    private final Production63_140 production = new Production63_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}