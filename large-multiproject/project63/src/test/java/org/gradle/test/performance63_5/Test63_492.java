package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_492 {
    private final Production63_492 production = new Production63_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}