package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_189 {
    private final Production18_189 production = new Production18_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}