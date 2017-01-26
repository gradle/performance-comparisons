package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_189 {
    private final Production26_189 production = new Production26_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}