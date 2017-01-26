package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_189 {
    private final Production90_189 production = new Production90_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}