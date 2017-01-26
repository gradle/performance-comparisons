package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_189 {
    private final Production81_189 production = new Production81_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}