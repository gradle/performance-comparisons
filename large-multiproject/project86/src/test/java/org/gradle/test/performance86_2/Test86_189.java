package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_189 {
    private final Production86_189 production = new Production86_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}