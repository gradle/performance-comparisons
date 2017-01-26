package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_415 {
    private final Production63_415 production = new Production63_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}