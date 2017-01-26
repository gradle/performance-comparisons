package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_227 {
    private final Production47_227 production = new Production47_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}