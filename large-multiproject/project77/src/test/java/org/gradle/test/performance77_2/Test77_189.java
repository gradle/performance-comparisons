package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_189 {
    private final Production77_189 production = new Production77_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}