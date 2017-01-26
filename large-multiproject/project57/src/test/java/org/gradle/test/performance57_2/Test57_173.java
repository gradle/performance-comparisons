package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_173 {
    private final Production57_173 production = new Production57_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}