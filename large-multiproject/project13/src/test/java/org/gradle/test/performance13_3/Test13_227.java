package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_227 {
    private final Production13_227 production = new Production13_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}