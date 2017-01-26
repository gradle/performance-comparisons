package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_173 {
    private final Production63_173 production = new Production63_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}