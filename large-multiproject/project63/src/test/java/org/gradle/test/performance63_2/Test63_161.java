package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_161 {
    private final Production63_161 production = new Production63_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}