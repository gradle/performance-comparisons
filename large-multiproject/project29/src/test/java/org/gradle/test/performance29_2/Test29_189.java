package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_189 {
    private final Production29_189 production = new Production29_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}