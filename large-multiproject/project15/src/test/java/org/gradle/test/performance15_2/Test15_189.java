package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_189 {
    private final Production15_189 production = new Production15_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}