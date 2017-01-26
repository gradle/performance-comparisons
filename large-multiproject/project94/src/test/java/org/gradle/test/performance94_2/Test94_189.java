package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_189 {
    private final Production94_189 production = new Production94_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}