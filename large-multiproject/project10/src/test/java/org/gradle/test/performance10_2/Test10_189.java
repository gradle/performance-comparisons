package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_189 {
    private final Production10_189 production = new Production10_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}