package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_227 {
    private final Production31_227 production = new Production31_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}