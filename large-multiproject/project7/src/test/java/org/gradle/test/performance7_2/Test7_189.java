package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_189 {
    private final Production7_189 production = new Production7_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}