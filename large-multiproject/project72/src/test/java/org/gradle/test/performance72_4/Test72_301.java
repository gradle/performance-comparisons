package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_301 {
    private final Production72_301 production = new Production72_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}