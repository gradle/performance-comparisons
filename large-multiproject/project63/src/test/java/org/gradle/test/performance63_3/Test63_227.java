package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_227 {
    private final Production63_227 production = new Production63_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}