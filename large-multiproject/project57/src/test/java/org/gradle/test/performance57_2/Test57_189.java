package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_189 {
    private final Production57_189 production = new Production57_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}