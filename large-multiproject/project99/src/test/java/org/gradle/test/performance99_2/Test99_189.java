package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_189 {
    private final Production99_189 production = new Production99_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}