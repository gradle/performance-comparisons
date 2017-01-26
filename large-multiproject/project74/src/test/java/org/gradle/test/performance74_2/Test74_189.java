package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_189 {
    private final Production74_189 production = new Production74_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}