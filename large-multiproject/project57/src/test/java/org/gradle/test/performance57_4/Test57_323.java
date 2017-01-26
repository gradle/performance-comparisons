package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_323 {
    private final Production57_323 production = new Production57_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}