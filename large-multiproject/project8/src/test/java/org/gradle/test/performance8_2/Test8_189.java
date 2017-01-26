package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_189 {
    private final Production8_189 production = new Production8_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}