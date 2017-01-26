package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_189 {
    private final Production25_189 production = new Production25_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}