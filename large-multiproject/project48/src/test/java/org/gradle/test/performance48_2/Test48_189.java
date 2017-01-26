package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_189 {
    private final Production48_189 production = new Production48_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}