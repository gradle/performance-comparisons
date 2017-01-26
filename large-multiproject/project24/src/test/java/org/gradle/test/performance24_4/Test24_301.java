package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_301 {
    private final Production24_301 production = new Production24_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}