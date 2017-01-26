package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_189 {
    private final Production16_189 production = new Production16_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}