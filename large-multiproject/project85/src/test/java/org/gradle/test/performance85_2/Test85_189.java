package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_189 {
    private final Production85_189 production = new Production85_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}