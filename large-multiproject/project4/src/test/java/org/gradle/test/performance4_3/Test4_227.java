package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_227 {
    private final Production4_227 production = new Production4_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}