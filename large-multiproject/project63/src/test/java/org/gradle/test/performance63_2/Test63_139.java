package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_139 {
    private final Production63_139 production = new Production63_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}