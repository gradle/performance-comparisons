package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_114 {
    private final Production63_114 production = new Production63_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}