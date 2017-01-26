package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_189 {
    private final Production49_189 production = new Production49_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}