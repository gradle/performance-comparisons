package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_146 {
    private final Production63_146 production = new Production63_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}