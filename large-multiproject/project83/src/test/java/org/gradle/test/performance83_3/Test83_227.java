package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_227 {
    private final Production83_227 production = new Production83_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}