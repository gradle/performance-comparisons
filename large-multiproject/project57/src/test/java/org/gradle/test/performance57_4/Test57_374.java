package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_374 {
    private final Production57_374 production = new Production57_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}