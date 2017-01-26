package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_189 {
    private final Production93_189 production = new Production93_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}