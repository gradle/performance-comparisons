package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_189 {
    private final Production98_189 production = new Production98_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}