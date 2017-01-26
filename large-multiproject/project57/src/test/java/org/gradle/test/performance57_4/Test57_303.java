package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_303 {
    private final Production57_303 production = new Production57_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}