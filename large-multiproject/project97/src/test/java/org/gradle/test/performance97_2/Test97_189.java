package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_189 {
    private final Production97_189 production = new Production97_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}