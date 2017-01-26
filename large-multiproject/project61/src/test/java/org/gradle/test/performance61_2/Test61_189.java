package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_189 {
    private final Production61_189 production = new Production61_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}