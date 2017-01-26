package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_189 {
    private final Production28_189 production = new Production28_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}