package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_346 {
    private final Production36_346 production = new Production36_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}