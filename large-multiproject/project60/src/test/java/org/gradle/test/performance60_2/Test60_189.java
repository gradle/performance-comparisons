package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_189 {
    private final Production60_189 production = new Production60_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}