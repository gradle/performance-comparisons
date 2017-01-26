package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_174 {
    private final Production57_174 production = new Production57_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}