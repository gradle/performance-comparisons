package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_189 {
    private final Production50_189 production = new Production50_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}