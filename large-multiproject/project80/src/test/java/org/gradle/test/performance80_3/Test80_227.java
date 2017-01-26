package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_227 {
    private final Production80_227 production = new Production80_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}