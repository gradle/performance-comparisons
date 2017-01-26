package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_304 {
    private final Production57_304 production = new Production57_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}