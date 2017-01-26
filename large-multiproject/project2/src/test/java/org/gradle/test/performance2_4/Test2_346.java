package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_346 {
    private final Production2_346 production = new Production2_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}