package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_360 {
    private final Production72_360 production = new Production72_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}