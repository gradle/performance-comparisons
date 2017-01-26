package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_178 {
    private final Production57_178 production = new Production57_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}