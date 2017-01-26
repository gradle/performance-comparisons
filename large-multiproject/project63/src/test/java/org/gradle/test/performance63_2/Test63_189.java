package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_189 {
    private final Production63_189 production = new Production63_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}