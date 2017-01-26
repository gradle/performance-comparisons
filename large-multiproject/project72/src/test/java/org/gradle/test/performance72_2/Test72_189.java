package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_189 {
    private final Production72_189 production = new Production72_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}