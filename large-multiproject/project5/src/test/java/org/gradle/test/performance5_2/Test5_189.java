package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_189 {
    private final Production5_189 production = new Production5_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}