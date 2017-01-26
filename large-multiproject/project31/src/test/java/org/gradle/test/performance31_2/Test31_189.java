package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_189 {
    private final Production31_189 production = new Production31_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}