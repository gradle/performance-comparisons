package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_122 {
    private final Production63_122 production = new Production63_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}