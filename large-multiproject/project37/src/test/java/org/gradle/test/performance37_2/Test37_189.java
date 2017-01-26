package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_189 {
    private final Production37_189 production = new Production37_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}