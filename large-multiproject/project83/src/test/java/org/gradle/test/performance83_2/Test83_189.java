package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_189 {
    private final Production83_189 production = new Production83_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}