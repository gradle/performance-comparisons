package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_189 {
    private final Production39_189 production = new Production39_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}