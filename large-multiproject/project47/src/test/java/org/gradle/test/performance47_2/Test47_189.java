package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_189 {
    private final Production47_189 production = new Production47_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}