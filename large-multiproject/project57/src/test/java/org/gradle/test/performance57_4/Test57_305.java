package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_305 {
    private final Production57_305 production = new Production57_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}