package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_189 {
    private final Production30_189 production = new Production30_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}