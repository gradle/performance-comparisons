package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_317 {
    private final Production57_317 production = new Production57_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}