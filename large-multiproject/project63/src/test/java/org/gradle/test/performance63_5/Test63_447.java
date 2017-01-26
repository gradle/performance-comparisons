package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_447 {
    private final Production63_447 production = new Production63_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}