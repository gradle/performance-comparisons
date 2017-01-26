package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_297 {
    private final Production57_297 production = new Production57_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}