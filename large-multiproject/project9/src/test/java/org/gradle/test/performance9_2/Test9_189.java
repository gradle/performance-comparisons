package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_189 {
    private final Production9_189 production = new Production9_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}