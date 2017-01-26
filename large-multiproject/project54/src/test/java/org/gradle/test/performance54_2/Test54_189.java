package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_189 {
    private final Production54_189 production = new Production54_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}