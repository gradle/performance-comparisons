package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_175 {
    private final Production63_175 production = new Production63_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}