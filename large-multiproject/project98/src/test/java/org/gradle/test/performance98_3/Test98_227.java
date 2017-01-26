package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_227 {
    private final Production98_227 production = new Production98_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}