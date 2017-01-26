package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_189 {
    private final Production80_189 production = new Production80_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}